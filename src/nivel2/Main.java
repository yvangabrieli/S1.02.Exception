package nivel2;

public class Main {
    public static void main(String[] args) throws EntryException {
        byte age = Entry.readByte("how old are you?");
        System.out.println(age);
        int like = Entry.readInt("How many user benefit of AI ?");
        System.out.println(like);
        float rent = Entry.readFloat("How much is your rent?");
        System.out.println(rent);
        double average = Entry.readDouble("what is your average score on programming exercises?");
        System.out.println(average);
        char digit = '\u0000';

        try {
            digit = Entry.readChar("Type one Digit from the keyboard?");
        } catch (EntryException e) {
            throw new RuntimeException(e);
        }

        System.out.println(digit);
        String name = Entry.readString("What is your ID ?");
        System.out.println(name);
        boolean question = Entry.readBoolean("Did you like questions 's' for yes and  'n' for no?");
        System.out.println(question);
    }
}
