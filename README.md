# 🏨 Hotel Room Service Management System

A console-based Java application that simulates a hotel room service ordering system. Built as a beginner project to apply core Object-Oriented Programming concepts learned during training.

---

## 📌 About the Project

This project allows hotel staff to register a guest, display available room services, take orders, and generate a final bill — including a discount for Suite room guests.

It was built from scratch as a hands-on assignment to reinforce Java fundamentals and OOP design.

---

## ✨ Features

- Guest registration with name, room number, and room type
- Dynamic service menu — selected services disappear from the list (no duplicate orders)
- Interactive ordering loop using `switch-case`
- Automatic 10% discount for Suite room guests
- Clean, formatted bill generation with all availed services

---

## 🛠️ Tech Stack

- **Language:** Java (JDK 24)
- **IDE:** IntelliJ IDEA
- **Type:** Console Application

---

## 🧱 Project Structure

```
Hotel Room Service Management System
│
├── Guest.java            # Stores guest details (name, room number, room type)
├── RoomService.java      # Stores service details (id, name, price)
├── BillGenerator.java    # Calculates total bill with optional Suite discount
└── HotelApp.java         # Main class — handles input, menu loop, and bill display
```

---

## 💡 OOP Concepts Applied

| Concept | Where Applied |
|---|---|
| **Classes & Objects** | `Guest`, `RoomService`, `BillGenerator` |
| **Encapsulation** | All fields are `private` with `getters` and `setters` |
| **Constructor** | Used in `Guest` and `RoomService` to initialize objects |
| **Static Methods** | `BillGenerator.calculateTotal()` called without creating an object |
| **Arrays** | `RoomService[]` for services, `boolean[]` for tracking selections |
| **Control Flow** | `while` loop, `switch-case`, `if-else` |

---

## 📚 What I Learned

- How to design a multi-class Java project from scratch
- The importance of **Encapsulation** — why fields should be `private` and accessed via getters/setters
- How `this` keyword works in constructors — debugged a `NullPointerException` caused by missing `this.roomType = roomType`
- Difference between `input.next()` and `input.nextLine()` — fixed a Scanner newline bug
- Using `boolean[]` array to track state (selected/not selected)
- How `switch-case` works as a cleaner alternative to `if-else`
- Real-world debugging — reading stack traces and fixing bugs independently

---

## 🐛 Bugs I Debugged Myself

1. **NullPointerException** — `this.` was missing in constructor, so `roomType` was never saved to the field
2. **Scanner newline issue** — `input.nextLine()` was consuming leftover `\n` after `nextInt()`, fixed with a buffer clear
3. **Discount logic** — was returning `total * 0.1` (only the discount amount) instead of `total * 0.9` (discounted total)
4. **Service not hiding** — fixed by checking `!selected[r.getId()-1]` before printing each service

---

## 🚀 How to Run

1. Clone the repository
```bash
git clone https://github.com/priyanshu091/hotel-room-service.git
```

2. Open in IntelliJ IDEA

3. Run `HotelApp.java`

4. Follow the console prompts:
   - Enter guest name, room number, room type
   - Select services by ID
   - Enter `0` to generate the final bill

---

## 📸 Sample Output

```
Welcome to Sunshine Hotel
Enter Guest Name:
Priyanshu
Enter Room Number:
123
Enter Room Type: (Standard, Deluxe, Suite)
Suite

Available Services:
1. Breakfast - ₹250
2. Lunch - ₹400
3. Dinner - ₹500
4. Laundry - ₹150
5. Spa Session - ₹800
0. Generate Bill
Select Service ID: 2
Service Added: Lunch

...

--------Final Bill--------
Guest Name: Priyanshu
Room Number: 123
Room Type: Suite

Services Availed:
Lunch: ₹400
Spa Session: ₹800
--------------------------
Discount Applied: 10%
Total Amount: ₹1080
Thank You! Visit Again!
```

---

## 🙋‍♂️ Author

**Priyanshu Vishwakarma**
Beginner Java Developer | Learning OOP & Software Design

---

> *This project was built as part of my Java learning journey. Every bug, every fix, and every concept in this project was understood and applied by me — not just copied.*
