# Online Quiz Application (Java Swing)

A simple Java-based Quiz Application built using Swing.  
The application includes Login, Rules, Quiz, and Score screens.  
Questions are stored in a 2D array, and the system evaluates the score based on user responses.

---

## 🚀 Features
- Login screen to enter user name.
- Rules screen explaining quiz instructions.
- Quiz window displaying MCQs with 4 options.
- Next button to switch questions.
- Score calculation based on correct answers.
- Final Score screen showing user performance.
- Clean Swing UI with modular code.
- Question bank stored inside a 2D array.

---

## 🧱 Project Structure (Classes)
### **1. Login Class**
- Takes username input from the user.
- Validates input and navigates to Rules screen.
- Acts as the entry point of the application.

### **2. Rules Class**
- Displays quiz instructions.
- Provides "Back" and "Start" buttons.
- Passes username to the Quiz class.

### **3. Quiz Class**
- Core engine of the app.
- Displays questions & options.
- Handles user selection.
- Calculates score internally.
- Moves through the question list.

### **4. Score Class**
- Shows final score.
- Displays username.
- Option to exit the quiz.

---

## 🧠 Question Handling
- All questions are stored in a **2D String array**.
- Includes:
  - Question text  
  - 4 options  
  - Correct answer index  
- Loaded once at the start using the `loadQuestions()` method.

---

## 🧩 Important Methods

### **loadQuestions()**
- Initializes the question bank.
- Stores all questions in an array.
- Centralized location to update quiz content.

### **displayQuestion()**
- Displays the current question and options.
- Updates Swing components dynamically.
- Clears previous selections.

---

## 🖥 How It Works (Flow)
1. Login → Enter Name  
2. Rules → Read Instructions  
3. Quiz → Answer MCQs  
4. Score → Final Results  

---

## 📐 Architecture (MVC Style)
- **model** → Question data (array-based)  
- **ui** → Login, Rules, Quiz, Score screens  
- **logic** → Answer checking, scoring, question switching  
- Maintains clean separation of concerns.

---

## ▶️ How to Run
### **Method 1: Using IntelliJ IDEA**
1. Open IntelliJ  
2. Create new Java project  
3. Add all `.java` files  
4. Set main class to `Login`  
5. Run the project  

### **Method 2: Using Terminal**
```bash
javac *.java
java Login
