public class List {
    Element element;
    private Element last;


    public List() { }
    public int leng() {
        int res = 0;
        Element t = element;
        while (t != null)
        {
            t = t.next;
            res++;
        }
        return res++;
    }

    void addInPlace(int data) {
        Element a = new Element();
        a.Idea = data;
        int place= leng()/2;
            int ind=0;
            Element t = element;
            while (ind < place ) {
                t = t.next;
                ind++;
            }
            a.next = t.next;
            t.next = a;

    }
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