    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    for(String s:logs){
        String[] str=s.split(" ");
        int x=Integer.valueOf(str[0]);
        int y=Integer.valueOf(str[1]);
        if(x==y){
            if(map.containsKey(x)){
                map.replace(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        else{
            if(map.containsKey(x)){
                map.replace(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
            if(map.containsKey(y)){
                map.replace(y,map.get(y)+1);
            }
            else{
                map.put(y,1);
            }
        }
    }
    int a[][]=new int[map.size()][2];
    int index=0;
    for(Map.Entry m:map.entrySet()){
        if((int)m.getValue()>=threshold){
            a[index][0]=(int)m.getKey();
            a[index][1]=(int)m.getValue();
            index++;
        }
    }
    for(int i=0;i<index;i++){
        for(int j=i+1;j<index;j++){
            if(a[i][0]>a[j][0]){
                int t1=a[i][0];
                int t2=a[i][1];
                a[i][0]=a[j][0];
                a[i][1]=a[j][1];
                a[j][0]=t1;
                a[j][1]=t2;
            }
        }
    }
    List<String> s=new ArrayList<String>();
    for(int i=0;i<index;i++){
        s.add(String.valueOf(a[i][0]));
    }
    return s;
    }
}
