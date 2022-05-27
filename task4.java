
public class task4 {


        static void validate (int age) throws InvalidAgeException{
            if(age < 23){

                // throw an object of user defined exception
                throw new InvalidAgeException("age is not valid to vote");
            }
            else {
                System.out.println("welcome to vote");
            }
        }

        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
        public void checkLanguage(String language) throws ProgrammingLanguageException {

            // throw exception if language already present in ArrayList
            if(languages.contains(language)) {
                throw new ProgrammingLanguageException(language + " already exists");
            }
            else {
                // insert language to ArrayList
                languages.add(language);
                System.out.println(language + " is added to the ArrayList");
            }
        }

        public static void main(String[] args) {
            Task4 obj = new Task4();
            try {
                obj.checkLanguage("Swift");
                obj.checkLanguage("Java");
            } catch (ProgrammingLanguageException e) {
                System.out.println("[" + e + "] Exception Occured");
            }
            try {
                // calling the method
                validate(23);
            } catch (InvalidAgeException ex) {
                System.out.println("Caught the exception");

                // printing the message from InvalidAgeException object
                System.out.println("Exception occured: " + ex);
            }

            try {
                // throw an object of user defined exception
                throw new MyCustomException();
            } catch (MyCustomException ex) {
                System.out.println("Caught the exception");
                System.out.println(ex.getMessage());
}
