package BehavioralPatterns.Command.example0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Invoker.
 * A universal remote.
 *
 * @author Alice B.
 * @version 15/02/2021
 */
public class RemoteControl {
    /** The commands of the universal remote. */
    private List<ICommand> commands;
    /** The remote can only contain this number of commands. */
    private static final int MAX = 20;

    /**
     * Constructor.
     */
    public RemoteControl() {
        this.commands = new ArrayList<>();
    }

    /**
     * Command getter by its index.
     * NOTE : The index should be < size of the command list.
     *
     * @param index The index of the command.
     * @return The command at the communicated index, null if the index is incorrect.
     */
    public ICommand getCommand(int index) {
        if(index < commands.size()) {
            return commands.get(index);
        }
        return null;
    }

    /**
     * To add a Command to the list of commands.
     * NOTE : The list shouldn't have reached the max nb of commands possibly added, neither should it already contain the command.
     *
     * @param command The Command to add.
     * @return 0 if everything went well, -1 otherwise.
     */
    public int addCommand(ICommand command) {
        if((commands.size() < MAX) && !(this.commands.contains(command))) {
            commands.add(command);
            return 0;
        }
        return -1;
    }

    /**
     * To remove a Command by passing it in param.
     *
     * @param command The Command to remove.
     * @return 0 if the command could be removed, -1 if the list of commands doesn't contain the command passed in param.
     */
    public int removeCommand(ICommand command) {
        if(commands.contains(command)) {
            commands.remove(command);
            return 0;
        }
        return -1;
    }

    /**
     * To remove a Command by its index.
     *
     * @param index The index where the command is in the list of commands.
     * @return 0 if the command could be removed, -1 if the index is incorrect (index >= list.size()).
     */
    public int removeCommand(int index) {
        if(index < commands.size()) {
            commands.remove(commands.get(index));
            return 0;
        }
        return -1;
    }

    /**
     * To add all the Commands passed in params in the list of commands.
     *
     * @param commands The commands to add.
     * @return true if everything went ok, false otherwise (Max number of commands reached OR the list already contains (1, n) commands passed in param).
     */
    public boolean addAll(ICommand... commands) {
        boolean res = true;
        for(ICommand command : commands) {
            res &= addCommand(command) == 0;
        }
        return res;
    }

    /**
     * To remove from the list all the commands passed in param.
     *
     * @param commands The commands to remove.
     * @return true if everything went ok, false otherwise.
     */
    public boolean removeAll(ICommand... commands) {
        return this.commands.removeAll(Arrays.asList(commands));
    }

    /**
     * Commands getter.
     *
     * @return The list of commands.
     */
    public List<ICommand> getCommands() {
        return this.commands;
    }

    /**
     * To execute all the commands of the list, if the list isn't null.
     */
    public void executeAll() {
        if(this.commands != null) {
            for(ICommand command : this.commands) {
                command.execute();
            }
        }
    }
}
