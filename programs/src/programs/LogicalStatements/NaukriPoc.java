package programs.LogicalStatements;

import java.util.Scanner;

public class NaukriPoc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== WELCOME TO VCUBE JOB PORTAL =====");

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your qualification:");
        String qualification = sc.nextLine();

        System.out.println("Enter your years of experience:");
        int years = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your location:");
        String location = sc.nextLine();

        System.out.println("Enter your technical skills:");
        String technicalSkill = sc.nextLine();

        System.out.println("Are you available for interview? (true/false):");
        boolean available = sc.nextBoolean();

        System.out.println("Enter your notice period in days:");
        int noticePeriod = sc.nextInt();

        System.out.println("Enter your expected salary:");
        double expectedSalary = sc.nextDouble();


        // First level: Qualification
        if (qualification.equalsIgnoreCase("senior developer")) {

            System.out.println("\nQualification accepted.");

            // Second level: Experience
            if (years < 2) {

                System.out.println("Experience requirement satisfied.");

                // Third level: Salary
                if (expectedSalary <= 2000000) {

                    System.out.println("Expected salary is acceptable.");

                    // Fourth level: Interview availability
                    if (available) {

                        System.out.println("You are available for interview.");

                        // Fifth level: Notice period
                        if (noticePeriod <= 30) {

                            System.out.println("\n===== HR ROUND =====");

                            System.out.println("Enter your communication rating (1-10):");
                            int communication = sc.nextInt();

                            System.out.println("Enter your confidence rating (1-10):");
                            int confidence = sc.nextInt();

                            System.out.println("Are you willing to relocate? (true/false):");
                            boolean relocate = sc.nextBoolean();


                            // HR Round
                            if (communication >= 7) {

                                System.out.println("Communication skills are good.");

                                if (confidence >= 7) {

                                    System.out.println("Confidence level is good.");

                                    if (relocate) {

                                        System.out.println("\n===== HR DISCUSSION =====");

                                        System.out.println(
                                                "Are you comfortable with company policies? (true/false):");
                                        boolean companyPolicy = sc.nextBoolean();

                                        System.out.println(
                                                "Are you comfortable with the offered salary? (true/false):");
                                        boolean salaryComfort = sc.nextBoolean();


                                        // HR Discussion
                                        if (companyPolicy) {

                                            System.out.println("Company policies accepted.");

                                            if (salaryComfort) {

                                                System.out.println("\n===== FINAL RESULT =====");
                                                System.out.println(
                                                        "Congratulations " + name + "!");
                                                System.out.println(
                                                        "You have successfully cleared the HR Round.");
                                                System.out.println(
                                                        "You have successfully cleared the HR Discussion.");
                                                System.out.println(
                                                        "You are SELECTED for the job.");

                                            } else {

                                                System.out.println(
                                                        "You are not comfortable with the offered salary.");
                                                System.out.println(
                                                        "Application rejected.");
                                            }

                                        } else {

                                            System.out.println(
                                                    "You are not comfortable with company policies.");
                                            System.out.println(
                                                    "Application rejected.");
                                        }

                                    } else {

                                        System.out.println(
                                                "You are not willing to relocate.");
                                        System.out.println(
                                                "Application rejected.");
                                    }

                                } else {

                                    System.out.println(
                                            "Your confidence rating is too low.");
                                    System.out.println(
                                            "You did not clear the HR Round.");
                                }

                            } else {

                                System.out.println(
                                        "Your communication rating is too low.");
                                System.out.println(
                                        "You did not clear the HR Round.");
                            }

                        } else {

                            System.out.println(
                                    "Your notice period is more than 30 days.");
                        }

                    } else {

                        System.out.println(
                                "You are not available for the interview.");
                    }

                } else {

                    System.out.println(
                            "Your expected salary is above our budget.");
                }

            } else {

                System.out.println(
                        "You have more than the required experience.");
            }

        } else {

            System.out.println(
                    "Your qualification does not match the requirement.");
        }

        sc.close();
    }
}