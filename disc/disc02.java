public static Intlist square(Intlist L) {
    if(L==NULL){
        return NULL;
    }
    Intlist R = new Intlist(L.first*L.first,square(L.rest));
    return R;
    
}//recursion

public static Intlist squareMutative(Intlist L) {
    if(L==NULL){
        return L;
    }
    L.first*=L.first;
    /*L.rest=*/squareMutative(L.rest);
    return L;
}

public int size(){
    IntNode p=first;
    int cnt=0;
    while(p!=NULL){
        cnt++;
        p=p.rest;
    }
}