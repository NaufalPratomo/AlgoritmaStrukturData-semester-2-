package JobSheet8.Tugas;

class Pembeli {
    String nama;
    int noHP;

    Pembeli(String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }
}

class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return (size == 0);
    }

    boolean isFull() {
        return (size == max);
    }

    void enqueue(Pembeli antri) {
        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        } else {
            System.out.println("Queue sudah penuh");
        }
    }

    Pembeli dequeue() {
        Pembeli dt = null;
        if (!isEmpty()) {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        } else {
            System.out.println("Queue masih kosong");
        }
        return dt; 
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang : " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void peekPosition(String namaPembeli) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            for (int i = front; i != rear; i = (i + 1) % max) {
                if (antrian[i].nama.equals(namaPembeli)) {
                    System.out.println(namaPembeli + " berada di posisi antrian ke-" + (i + 1));
                    return;
                }
            }
            if (antrian[rear].nama.equals(namaPembeli)) {
                System.out.println(namaPembeli + " berada di posisi antrian ke-" + (rear + 1));
            } else {
                System.out.println(namaPembeli + " tidak ada dalam antrian");
            }
        }
    }
    
    void daftarPembeli() {
        if (!isEmpty()) {
        int i = front;
        while (i != rear) {
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            i = (i + 1) % max;
        }
        System.out.println(antrian[i].nama + " " + antrian[i].noHP);
        System.out.println("Jumlah elemen = " + size);
    } else {
        System.out.println("Queue masih kosong");
    }
        }
    }

