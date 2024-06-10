package app;
//  checked exception for invalid age
class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}

// Voter class
class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("invalid age for voter");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main method for testing
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(101, "prasanthi", 20);
            System.out.println("Voter 1 created successfully: " + voter1.getName());
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }

        try {
            Voter voter2 = new Voter(102, "pinky", 17);
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }
    }
}


