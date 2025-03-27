public class Queue {
      int size=5;
      int items[]=new int[size];
      Queue() {
            front=-1;
            rear=-;
}
if(front==0 && rear== size=-1){
    return true;
}
    return false;
}
Empty()
  if(front==-1)
     return true;
  else:
     return false;
}
void enQueue(int element){
  if(isFull()){
     System.out.println("Queue isFull")
}
  else{
  if(front==-1){
front=0;}
rear++;
items[rear]=element;
    System.out.println("Insert" + element);
}
}
int deQueue() {
int element;
if(isEmpty()){
   System.out.println("Queue is empty");
   return(-1);
}
else{
element=items[front];
if(front>= rear){
    front=-1;
    rear=-1;
}
else{
System.out.println(element+deleted);
return(element);
}
void display() {
     int i ;
     if(isEmpty()){
        System.out.println("empty Queue");}
     else{
System.out.println("Items->");
for(i=front; i<=rear; i++)
System.out.println(items[i+"");
System.out.println("\n rear index->"+rear);
}
}
Queue q=new Queue();
q=deQueue(i);
}
q.enQueue(6);
q.display();
q.deQueue();
q.display();
}
}

