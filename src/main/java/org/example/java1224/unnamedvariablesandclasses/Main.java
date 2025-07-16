int number = 10;

void main() {
    printNumber();
    System.out.println(square(number));
    System.out.println("Hello, World");
}

void printNumber() {
    System.out.println(number);
}

int square(int x) {
    return x * x;
}