package nivel2;

public class Main {
    public static void main(String[] args) throws EntradaException {
        byte age = Entrada.readByte("how old are you?");
        System.out.println(age);
        int like = Entrada.readInt("How many user benefit of AI ?");
        System.out.println(like);
        float rent = Entrada.readFloat("How much is your rent?");
        System.out.println(rent);
        double average = Entrada.readDouble("what is your average score on programming exercises?");
        System.out.println(average);
        char digit = '\u0000';

        try {
            digit = Entrada.readChar("Type one Digit from the keyboard?");
        } catch (EntradaException e) {
            throw new RuntimeException(e);
        }

        System.out.println(digit);
        String name = Entrada.readString("What is your ID ?");
        System.out.println(name);
        boolean question = Entrada.readBoolean("Did you like questions 's' for yes and  'n' for no?");
        System.out.println(question);
    }
}
