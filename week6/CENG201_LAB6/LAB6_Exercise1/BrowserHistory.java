public class BrowserHistory {

    private Stack backStack;
    private Stack forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = new Stack();
        forwardStack = new Stack();
        currentPage = null;
    }

    // STEP 1: Implement visit(String url).
    // 1. If currentPage is not null, push it onto backStack.
    // 2. Assign url to currentPage.
    // 3. Clear forwardStack because visiting a new page creates a new navigation path.
    // 4. Print the visited webpage. Ex: ("Visited: " + currentPage)

    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        clearStack(forwardStack);
        System.out.println("Visited: " + currentPage);
    }

    // STEP 2: Implement goBack().
    // 1. Check whether backButtonStack is empty. İf empty, give a message as ("Cannot go back!") and return
    // 3. Push currentPage onto forwardButtonStack.
    // 4. Pop the previous webpage from backSButtontack.
    // 5. Assign the popped webpage to currentPage.
    // 6. Print the current webpage. EX:("Went back to: " + currentPage)

    public void goBack() {
        if (backStack.isEmpty()) {
            System.out.println("Cannot go back!");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        System.out.println("Went back to: " + currentPage);
    }

    // STEP 3: Implement goForward().
    // 1. Check whether forwardStack is empty. If empty, print a message ("Cannot go forward!") and return.
    // 3. Push currentPage onto backButtonStack.
    // 4. Pop a webpage from forwardButtonStack.
    // 5. Assign it to currentPage.
    // 6. Print the current webpage. ("Went forward to: " + currentPage)

    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("Cannot go forward!");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("Went forward to: " + currentPage);
    }

    // STEP 4: Display the current webpage.
    // If currentPage is null, print that no page is open.
    // Otherwise, print the currentPage.

    public void displayCurrentPage() {
        if (currentPage == null) {
            System.out.println("No page is open.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }

    // STEP 5: ClearStack
    // Clear all elements from a stack.
    // Use pop() repeatedly until the stack becomes empty. (use while loop)
    // This method is needed when visiting a new webpage.

    private void clearStack(Stack stack) {
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public void displayHistory() {
        System.out.println("\n========== BROWSER HISTORY ==========");

        System.out.println("Current page: " + currentPage);

        System.out.print("Back stack (top -> bottom): ");
        backStack.display();

        System.out.print("Forward stack (top -> bottom): ");
        forwardStack.display();

        System.out.println("=====================================");

    }
}
