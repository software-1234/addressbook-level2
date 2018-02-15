package seedu.addressbook.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.addressbook.common.Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import seedu.addressbook.commands.AddCommand;
import seedu.addressbook.commands.ClearCommand;
import seedu.addressbook.commands.Command;
import seedu.addressbook.commands.DeleteCommand;
import seedu.addressbook.commands.ExitCommand;
import seedu.addressbook.commands.FindCommand;
import seedu.addressbook.commands.HelpCommand;
import seedu.addressbook.commands.IncorrectCommand;
import seedu.addressbook.commands.ListCommand;
import seedu.addressbook.commands.ViewAllCommand;
import seedu.addressbook.commands.ViewCommand;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.person.Phone;
import seedu.addressbook.data.person.ReadOnlyPerson;
import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.tag.UniqueTagList;
import seedu.addressbook.parser.Parser;

import static org.junit.Assert.assertEquals;

public class HelpCommandTest {

    @Test
    public void checkCorrectAddResponse(){
        HelpCommand helpTest = new HelpCommand("add");
        HelpCommand caseCheck = new HelpCommand("ADD");
        CommandResult addHelpTest = new CommandResult(
                AddCommand.MESSAGE_USAGE
        );

        assertEquals(addHelpTest.feedbackToUser,helpTest.execute().feedbackToUser);
        assertEquals(addHelpTest.feedbackToUser,caseCheck.execute().feedbackToUser);
    }
    @Test
    public void checkCorrectDeleteResponse(){
        HelpCommand helpTest = new HelpCommand("delete");
        CommandResult deleteHelpTest = new CommandResult(
                DeleteCommand.MESSAGE_USAGE
        );

        assertEquals(deleteHelpTest.feedbackToUser,helpTest.execute().feedbackToUser);
    }
    @Test
    public void checkCorrectClearResponse(){
        HelpCommand helpTest = new HelpCommand("clear");
        CommandResult clearHelpTest = new CommandResult(
                ClearCommand.MESSAGE_USAGE
        );

        assertEquals(clearHelpTest.feedbackToUser,helpTest.execute().feedbackToUser);
    }
    @Test
    public void checkCorrectExitResponse(){
        HelpCommand helpTest = new HelpCommand("exit");
        CommandResult exitHelpTest = new CommandResult(
                ExitCommand.MESSAGE_USAGE
        );

        assertEquals(exitHelpTest.feedbackToUser,helpTest.execute().feedbackToUser);
    }

    @Test
    public void checkCorrectFindResponse(){
        HelpCommand helpTest = new HelpCommand("find");
        CommandResult findHelpTest = new CommandResult(
                FindCommand.MESSAGE_USAGE
        );

        assertEquals(findHelpTest.feedbackToUser,helpTest.execute().feedbackToUser);
    }

    @Test
    public void checkCorrectListResponse(){
        HelpCommand helpTest = new HelpCommand("list");
        CommandResult listHelpTest = new CommandResult(
                ListCommand.MESSAGE_USAGE
        );

        assertEquals(listHelpTest.feedbackToUser,helpTest.execute().feedbackToUser);
    }
    @Test
    public void checkCorrectViewAllResponse(){
        HelpCommand helpTest = new HelpCommand("view all");
        HelpCommand caseCheck = new HelpCommand("VIEW all");

        CommandResult viewAllHelpTest = new CommandResult(
                ViewAllCommand.MESSAGE_USAGE
        );

        assertEquals(viewAllHelpTest.feedbackToUser,helpTest.execute().feedbackToUser);
        assertEquals(viewAllHelpTest.feedbackToUser,caseCheck.execute().feedbackToUser);
    }
    @Test
    public void checkCorrectViewResponse(){
        HelpCommand helpTest = new HelpCommand("view");
        CommandResult viewHelpTest = new CommandResult(
                ViewCommand.MESSAGE_USAGE
        );

        assertEquals(viewHelpTest.feedbackToUser,helpTest.execute().feedbackToUser);
    }
    @Test
    public void invalidCommandCheckResponse(){
        HelpCommand[] helpTest = {new HelpCommand("apple"),new HelpCommand("dfdsfd"),new HelpCommand("Invalid")};
        CommandResult invalidHelpTest = new CommandResult(
                "You have entered an invalid command or invalid help command. These are the valid commands: add, delete, "
                + "clear, find, list, view, view all, help, exit."
        );
        for(HelpCommand keyword : helpTest) {
            assertEquals(invalidHelpTest.feedbackToUser, keyword.execute().feedbackToUser);
        }
    }

}
