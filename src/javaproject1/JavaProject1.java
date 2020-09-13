public class Try {
    public void myBuf (StringBuffer s, StringBuffer s1) {
        s.append ("B");
        s = s1;
    }
    public static void main (String args [ ] ) {
        Try t = new Try();
        StringBuffer s = new StringBuffer ("A");
        StringBuffer sl = new StringBuffer ("B");
        t.myBuf(s, sl);
        System.out.print(s);
    }
}