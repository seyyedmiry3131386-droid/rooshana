package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wq3 {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int iHashCode = hashCode();
        js3.q(16);
        String string = Integer.toString(iHashCode, 16);
        js3.o(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
