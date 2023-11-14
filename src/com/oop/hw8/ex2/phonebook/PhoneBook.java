package com.oop.hw8.ex2.phonebook;

public interface PhoneBook {
    /** Add a person to the PhoneBook
     * @param student The person to be added to the PhoneBook
     */
    void addPerson(Student student);

    /** Search a person in the PhoneBook by first name
     * @param name The name to be searched
     * @return The person founded, otherwise return null
     */
    Student searchByFirstName(String name);

    /** Search a person in the PhoneBook by last name
     * @param name The name to be searched
     * @return The person founded, otherwise return null
     */
    Student searchByLastName(String name);

    /** Search a person in the PhoneBook by phone number
     * @param phoneNumber The phone number to be searched
     * @return The person founded, otherwise return null
     */
    Student searchByNumber(String phoneNumber);

    /** Delete a person from the PhoneBook
     * @param phoneNumber The phone number to be searched
     */
    void deleteByNumber(String phoneNumber);
}
