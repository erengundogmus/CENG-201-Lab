# Exercise 1 — Browser history

| Operation | Current page |
|---|---|
| Initial state | No page is open |
| Visit Google | google.com |
| Visit YouTube | youtube.com |
| Go back | google.com |
| Visit Facebook | Facebook.com |
| Go back | google.com |
| Go forward | Facebook.com |
| Visit StackOverflow | stackoverflow.com |

Visiting a new page clears the forward stack. For example, after going back from YouTube to Google and visiting Facebook, YouTube is no longer available through Forward.

Stacks use last in, first out (LIFO). Back restores the page most recently left. Forward restores the page most recently left by pressing Back.

| Method | Worst-case time | Reason |
|---|---|---|
| push | O(1) | Link one node at the top. |
| pop | O(1) | Move the top reference once. |
| peek | O(1) | Read the top node. |
| visit | O(f), or O(1) when empty | Clear all f forward entries by popping each one. Worst case O(n) for n history entries. |
| goBack | O(1) | One push and one pop when available. |
| goForward | O(1) | One push and one pop when available. |

# Exercise 2 — Recursive reversal

Each call swaps the two outer values, then reverses the remaining inner range. The recursion stops when the indices meet or cross. An array of n elements needs floor(n/2) swaps, so the running time is O(n).

# Homework A — Worst-case time

Beginning means head, top, or front. For stack and queue, the table uses their standard public operations. A dash means there is no direct operation. The time in parentheses shows the cost of simulating it while preserving the order of the other items, using temporary storage if needed.

| Operation | Singly linked list | Doubly linked list | Stack | Queue |
|---|---|---|---|---|
| Insert at beginning | O(1) | O(1) | O(1) | — (O(n)) |
| Insert at end | O(n) | O(1) | — (O(n)) | O(1) |
| Delete from beginning | O(1) | O(1) | O(1) | O(1) |
| Delete from end | O(n) | O(1) | — (O(n)) | — (O(n)) |
| Access middle | O(n) | O(n) | — (O(n)) | — (O(n)) |
| Search for a value | O(n) | O(n) | — (O(n)) | — (O(n)) |
| Peek at first/top | O(1) | O(1) | O(1) | O(1) |

# Homework B — Scenarios

1. Choose a singly linked list. Insert by linking the new node before the head. Delete by moving the head to the next node. Both take O(1).
2. Choose a doubly linked list with a tail. The next and previous links support movement in both directions. Deleting the last song takes O(1) because the tail points back to its predecessor. A singly linked list must find that predecessor from the head, which takes O(n).
3. Choose a queue. Enqueue at the rear and dequeue from the front both take O(1). FIFO prints the oldest request first. A stack would print the newest request first.

# Homework C — Sequential operations

| Step | Operation | List after operation | Result | Worst-case time |
|---|---|---|---|---|
| 1 | Insert 5 at head | 5 → 10 → 20 → 30 → 40 → 50 | New head is 5 | O(1) |
| 2 | Append 60 | 5 → 10 → 20 → 30 → 40 → 50 → 60 | New last node is 60 | O(n) |
| 3 | Delete 30 | 5 → 10 → 20 → 40 → 50 → 60 | Link 20 directly to 40 | O(n) |
| 4 | Search for 40 | 5 → 10 → 20 → 40 → 50 → 60 | Found at position 4 | O(n) |
| 5 | Delete last node | 5 → 10 → 20 → 40 → 50 | Removed 60 | O(n) |
| 6 | Access middle | 5 → 10 → 20 → 40 → 50 | Middle value is 20 | O(n) |

Steps 2–6 require traversal. With a doubly linked list and a tail reference, step 5 takes O(1) because the previous link identifies the new tail immediately.

With 10,000 nodes, appending, deleting the last node, and finding the middle require longer traversals. Deletion by value and search also become more expensive in the worst case, depending on the target's position. Inserting at the head still takes O(1).
