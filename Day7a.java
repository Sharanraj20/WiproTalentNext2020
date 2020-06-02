int size= s.length();           int no=2;
    char[] ch= new char[size];
    for(int i=0;i<size;i++)
    {
        ch[i]=s.charAt(i);
    }
    boolean A = false;
for (char a : ch) {
    if (a == 'a') {
        A = true;
        break;
    }
}
 boolean E = false;
for (char e : ch) {
    if (e == 'e') {
        E = true;
        break;
    }
}
 boolean I = false;
for (char i : ch) {
    if (i == 'i') {
        I = true;
        break;
    }
}
 boolean O = false;
for (char o : ch) {
    if (o == 'o') {
        O = true;
        break;
    }
}
 boolean U = false;
for (char u : ch) {
    if (u == 'u') {
        U = true;
        break;
    }
}
 for(int j=0;j<size-1;j++)
    {
        if(ch[j]>=ch[j+1])
        no+=1;   
    }

if(A==E==I==O==U)
{
   return no;

}
else
    return 0;
    }

}
