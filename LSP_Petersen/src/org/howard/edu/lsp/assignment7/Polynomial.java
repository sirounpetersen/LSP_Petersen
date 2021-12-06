package org.howard.edu.lsp.assignment7;



class Node {
		int c;
		int p;
		Node next;
		Node(int x, int y)
		{
			c = x;
			p = y;
			next = null;
		}

}



class Polynomial {
	public static Node add(Node head1, Node head2)
	{
	
		Node x = head1, y = head2, newHead = new Node(0, 0),z = newHead;
		while (x!= null || y!= null)
		{
			if (x == null){
				z.next = y;
				break;
			}
			
			else if (y == null){
			z.next = x;
			break;
			}
			
			else if (x.p == y.p){
			z.next = new Node(x.c + y.c, x.p);
			x = x.next;
			y = y.next;
			}
				
			else if (x.p > y.p){
			z.next = new Node(x.c, x.p);
			x = x.next;
			}
				
			else if (x.p < y.p){
			z.next = new Node(y.c, y.p);
			y = y.next;
			}
			z = z.next;
		}
		return newHead.next;
		}
}


class LinkedList {
	public static void main(String args[])
	{
		Node start1 = null, curr1 = null, start2 = null,
				curr2 = null;
		int[] polyc = { 1, 5, 2 };
		int[] polyp = { 2, 1, 0 };
		int size = polyc.length;
		int i = 0;
		
		while (size-- > 0) {
			int x = polyc[i];
			int y = polyp[i];
			Node ptr1 = new Node(x, y);
			if (start1 == null) {
				start1 = ptr1;
				curr1 = ptr1;
			}
			else{
				curr1.next = ptr1;
				curr1 = ptr1;
			}
			i++;
		}
		
		int[] poly2c = { 4, 3, 8 };
		int[] poly2p = { 2, 1, 0 };
		size = poly2c.length;
		i = 0;
		while (size > 0) {
			int x = poly2c[i];
			int y = poly2p[i];
			Node ptr2 = new Node(x, y);
			if (start2 == null) {
				start2 = ptr2;
				curr2 = ptr2;
			}
			else
			{
				curr2.next = ptr2;
				curr2 = ptr2;
			}
			i++;
		}
		
		
		Polynomial obj = new Polynomial();
		Node sum = obj.add(start1, start2);
		Node ans = sum;
		while (ans != null){
			System.out.print(ans.c + "x^" + ans.p);
			if (ans.next != null)
				System.out.print(" + ");
			ans = ans.next;
		}
		System.out.println();
	}
}
