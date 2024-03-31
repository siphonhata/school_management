-- Define custom enumeration type for user roles
CREATE TYPE user_role AS ENUM ('STUDENT', 'TEACHER', 'PARENT', 'ADMIN');

-- Create Subject table
CREATE TABLE IF NOT EXISTS Subject (
    Id SERIAL PRIMARY KEY,
    Subject_name VARCHAR(255)
);

-- Create Classroom table
CREATE TABLE IF NOT EXISTS Classroom (
    Id SERIAL PRIMARY KEY,
    Class_number INT,
    Grade VARCHAR(10)
);

-- Create Users table
CREATE TABLE IF NOT EXISTS Users (
    Id SERIAL PRIMARY KEY,
    First_name VARCHAR(255),
    Last_name VARCHAR(255),
    Id_number VARCHAR(255),
    Date_of_birth DATE,
    Gender VARCHAR(10),
    Email VARCHAR(255),
    Phone_number VARCHAR(20),
    Address VARCHAR(255),
    Role user_role,
    Password VARCHAR(255)
);

-- Create Students table
CREATE TABLE IF NOT EXISTS Students (
    Id SERIAL PRIMARY KEY,
    userID INT REFERENCES Users(Id),
    Subjects VARCHAR(255),
    Extracurricular_activity VARCHAR(255),
    classroomID INT REFERENCES Classroom(Id)
);

-- Create Teacher table
CREATE TABLE IF NOT EXISTS Teacher (
    Id SERIAL PRIMARY KEY,
    userID INT REFERENCES Users(Id),
    ClassroomID INT REFERENCES Classroom(Id),
    subjectID INT REFERENCES Subject(Id),
    timetableID INT
);

-- Create Parent table
CREATE TABLE IF NOT EXISTS Parent (
    Id SERIAL PRIMARY KEY,
    userID INT REFERENCES Users(Id),
    studentID INT REFERENCES Students(Id)
);

-- Create Timetable table
CREATE TABLE IF NOT EXISTS Timetable (
    Id SERIAL PRIMARY KEY,
    subjectID INT REFERENCES Subject(Id),
    startTime TIME,
    Endtime TIME,
    Day VARCHAR(20),
    Date DATE,
    Type VARCHAR(20),
    teacherID INT REFERENCES Teacher(Id),
    classroomID INT REFERENCES Classroom(Id)
);

-- Create Extracurricular_activity table
CREATE TABLE IF NOT EXISTS Extracurricular_activity (
    Id SERIAL PRIMARY KEY,
    Activity_name VARCHAR(255),
    Teacher VARCHAR(255),
    Description TEXT,
    Start_date DATE,
    End_date DATE
);

-- Insert data into Subject table
INSERT INTO Subject (Subject_name)
VALUES
    ('Math'),
    ('English'),
    ('Science'),
    ('History');

-- Insert data into Classroom table
INSERT INTO Classroom (Class_number, Grade)
VALUES
    (101, 'A'),
    (202, 'B');

-- Insert data into Users table
INSERT INTO Users (First_name, Last_name, Id_number, Date_of_birth, Gender, Email, Phone_number, Address, Role, Password)
VALUES
    ('John', 'Doe', '123456789', '1995-08-15', 'Male', 'john.doe@example.com', '123-456-7890', '123 Main St, Anytown, USA', 'STUDENT', 'password123'),
    ('Jane', 'Smith', '987654321', '1990-03-25', 'Female', 'jane.smith@example.com', '987-654-3210', '456 Elm St, Othertown, USA', 'TEACHER', 'password456'),
    ('Alice', 'Johnson', '456123789', '1980-12-10', 'Female', 'alice.johnson@example.com', '456-123-7890', '789 Oak St, Anothertown, USA', 'PARENT', 'password789'),
    ('Bob', 'Brown', '789456123', '1975-05-20', 'Male', 'bob.brown@example.com', '789-456-1230', '321 Maple St, Somewhere, USA', 'ADMIN', 'admin123');

-- Insert data into Students table
INSERT INTO Students (userID, Subjects, Extracurricular_activity, classroomID)
VALUES
    (1, 'Math, Science', 'Chess Club', 1),
    (1, 'English, History', 'Basketball Team', 2);

-- Insert data into Teacher table
INSERT INTO Teacher (userID, ClassroomID, subjectID, timetableID)
VALUES
    (2, 2, 2, 2),
    (2, 2, 4, 2);

-- Insert data into Parent table
INSERT INTO Parent (userID, studentID)
VALUES
    (3, 1);

-- Insert data into Timetable table
INSERT INTO Timetable (subjectID, startTime, Endtime, Day, Date, Type, teacherID, classroomID)
VALUES
    (2, '09:00:00', '10:30:00', 'Monday', '2024-03-25', 'Regular', 1, 2),
    (4, '10:45:00', '12:15:00', 'Monday', '2024-03-25', 'Regular', 1, 2);

-- Insert data into Extracurricular_activity table
INSERT INTO Extracurricular_activity (Activity_name, Teacher, Description, Start_date, End_date)
VALUES
    ('Chess Club', 'Mr. Smith', 'Weekly chess club meeting for students interested in chess.', '2024-01-15', '2024-06-15'),
    ('Basketball Team', 'Ms. Johnson', 'Practices and games for the school basketball team.', '2024-01-20', '2024-05-20');