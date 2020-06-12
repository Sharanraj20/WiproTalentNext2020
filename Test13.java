  int path=0;
    String clo=String.valueOf(number);
    for(int i=0;i<clo.length();i++){
        int j=Character.digit(clo.charAt(i),10);
        if(j==0||j==4||j==6||j==9){
             path=path+1;
        }
        else if(j==8){
            path=path+2;
        }j++;
    }
    return path;
}
