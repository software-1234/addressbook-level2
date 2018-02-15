package seedu.addressbook.commands;


/**
 * Shows help instructions.
 */
public class HelpCommand extends Command {

    public static final String COMMAND_WORD = "help";
    public String command= new String();
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n"
            + "Example: " + COMMAND_WORD;

    public HelpCommand(String command) {
        this.command = command;

    }

    @Override
    public CommandResult execute() {
        switch(command.toLowerCase().trim()){
            case "add":
                return new CommandResult(
                    AddCommand.MESSAGE_USAGE
                );
            case "delete":
                return new CommandResult(
                    DeleteCommand.MESSAGE_USAGE
                );
            case "clear":
                return new CommandResult(
                    ClearCommand.MESSAGE_USAGE
                );
            case "find":
                return new CommandResult(
                    FindCommand.MESSAGE_USAGE
                );
            case "list":
                return new CommandResult(
                    ListCommand.MESSAGE_USAGE
                );
            case "view":
                return new CommandResult(
                    ViewCommand.MESSAGE_USAGE
                );
            case "view all":
                return new CommandResult(
                    ViewAllCommand.MESSAGE_USAGE
                );
            case "exit":
                return new CommandResult(
                    ExitCommand.MESSAGE_USAGE
                );

            case "all":
                return new CommandResult(
                        AddCommand.MESSAGE_USAGE
                                + "\n" + DeleteCommand.MESSAGE_USAGE
                                + "\n" + ClearCommand.MESSAGE_USAGE
                                + "\n" + FindCommand.MESSAGE_USAGE
                                + "\n" + ListCommand.MESSAGE_USAGE
                                + "\n" + ViewCommand.MESSAGE_USAGE
                                + "\n" + ViewAllCommand.MESSAGE_USAGE
                                + "\n" + HelpCommand.MESSAGE_USAGE
                                + "\n" + ExitCommand.MESSAGE_USAGE
                );
            default:
                return new CommandResult(
                        "You have entered an invalid command or invalid help command. These are the valid commands:" + " add, delete, " +
                                "clear, find, list, view, view all, help, exit."
                );

        }

    }
}
