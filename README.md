# Programming-Assignment-1

## Overview
This program is a solution for **Programming Assignment 1**. It allows users to manage a list of students by reading data from a CSV file, sorting the data based on specific criteria, and searching for a student by their first name. The program is implemented in Java and consists of the following files:

- `Main.java`: Contains the main program logic, including file reading, sorting, and searching.
- `Student.java`: Defines the structure and behavior of a student object.

## Author Information
- **Student ID:** 662115016
- **Email:** natthaphum_ch@cmu.ac.th
- **Name:** Natthaphum Chaikhan

## List of Files
1. `Main.java`
2. `Student.java`

## How to Compile the Program
To compile the program, run the following command in the terminal:
```bash
javac Student.java Main.java
```

## How to Run the Program
To run the program, use the following commands:
```bash
java Main n class_roaster67.csv
java Main f class_roaster67.csv
java Main l class_roaster67.csv
java Main s class_roaster67.csv
```

- `n`: Sort students by Student ID.
- `f`: Sort students by First Name.
- `l`: Sort students by Last Name.
- `s`: Search for a student by First Name.

## Example Program Output
### Sort Students by ID
```
622115040 SUCHANUN  SIRIJANYA
662115007 CHONCHANUN  KHACHONPHURITHANAKUL
662115016 NATTHAPHUM  CHAIKHAN
662115039 MANAPAT  KAEWLAI
672115001 KATIKA  KANTHASON
672115002 KRITTAMETH  TANSUWAN
672115004 JITTIPAT  KAEWIJIT
672115005 CHETSADA  KANKARN
```

### Sort Students by First Name
```
672115049 ANAWAT  JANDEE
672115007 CHANCHAKORN  JULLAPECH
672115006 CHANLACHAT  PANYOYAI
672115008 CHANYA  BUNRUEANG
672115005 CHETSADA  KANKARN
672115009 CHIDNUCHA  POBKEEREE
662115007 CHONCHANUN  KHACHONPHURITHANAKUL
672115018 DALANPHOP  KEAWSIRIPONG
```

### Sort Students by Last Name
```
672115044 VIDCHAYADA  ABHICHARTTIBUTRA
672115039 METAVEE  AEINJANG
672115041 RAPHEEPHAT  AEIPHINGCHAI
672115008 CHANYA  BUNRUEANG
672115028 NINA  BURGER
662115016 NATTHAPHUM  CHAIKHAN
672115013 NATTHAN  CHAMPATHIP
672115042 RANTICHA  CHUMJAI
```

### Search for a Student by First Name
```
Enter the first name: Natthaphum
Found at index 5: 662115016 NATTHAPHUM  CHAIKHAN
```
If the input is incorrect or the student is not found:
```
Not found
```


