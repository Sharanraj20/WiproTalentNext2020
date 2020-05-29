int i = 0,n,j=0;
     ArrayList<Integer> list=new ArrayList<Integer>();
        int size = arr.size();
        while(i < size) {
            n= arr.get(i);
            if(n%2==0||n==0)
             {
                 list.add(1);
             }
             else
             {
                list.add(0);
             }
            i++;
        }
        return list;
    }

}
