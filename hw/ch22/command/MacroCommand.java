import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 실행된 명령 스택
    private Deque<Command> commands = new ArrayDeque<>();
    // Step 1: Undo로 삭제된 명령을 보관하는 Redo 스택
    private Deque<Command> commandsForRedo = new ArrayDeque<>();

    // Step 4: descendingIterator로 꼬리(처음 추가된 명령)부터 순서대로 실행
    @Override
    public void execute() {
        Iterator<Command> it = commands.descendingIterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    // 추가 (새 명령이 오면 Redo 스택 초기화)
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
        commandsForRedo.clear(); // 새 명령 추가 시 Redo 불가
    }

    // Step 2: undo — 최근 명령을 꺼내 Redo 스택에 보관
    public void undo() {
        if (!commands.isEmpty()) {
            Command cmd = commands.pop();
            commandsForRedo.push(cmd);
        }
    }

    // Step 3: redo — Redo 스택에서 꺼내 commands에 복원
    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            Command cmd = commandsForRedo.pop();
            commands.push(cmd);
        }
    }

    // Step 5: clear — commandsForRedo도 함께 초기화
    public void clear() {
        commands.clear();
        commandsForRedo.clear();
    }
}
