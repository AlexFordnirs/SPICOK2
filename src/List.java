public class List {
    Element element;
    private Element last;

    public List() { }
    public void addFirst(int value)
    {
        if(element==null)
        {
            element = new Element(value);
            element.next=null;
        }
        else { Element tmp=new Element(value);
            tmp.next= element;
            element=tmp;
        }
    }
    public void delEl(int value)
    {
        if (element == null)
            return;

        if (element == last) {
            element = null;
            last = null;
            return;
        }

        if (element.Idea == value) {
            element = element.next;
            return;
        }
        Element t = element;
        while (t.next != null) {
            if (t.next.Idea == value) {
                if(last == t.next)
                {
                    last = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }

    public void CollView(){
        Element FFer = new Element();
        FFer =element;
        while (FFer!=null) {
            System.out.println(FFer.Idea+"");
            FFer = FFer.next;
        }
    }


}