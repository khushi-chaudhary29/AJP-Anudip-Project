class Queue{
    int x;
    void store(int j){
        x=j;//x is instant variable
        System.out.println("Produced"+x);
    }
    void retrieve(){
        System.out.println("Consumed"+x);
    }
}
class Producer extends Thread{
    Queue a;//reference to queue class which is pointing to queue object
    Producer(Queue q)//constructor taking queue type reference as input
    {
        a=q;
    }
    public void run(){
        int i=1;
        for(int m = 1;m<=50;m++){
            a.store(i++);
        }
    }
}
class Consumer extends Thread{
    Queue b;//reference to queue class which is pointing to queue object
    Consumer(Queue q)//constructor taking queue type reference as input
    {
        b=q;
    }
    public void run(){
        for(int m = 1;m<=50;m++){
            b.retrieve();
        }
    }
}
class ProducerConsumer{
    public static void main(String[] args){
        Queue q=new Queue();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);
        p.start();
        c.start();
    }
}