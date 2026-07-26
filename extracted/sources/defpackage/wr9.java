package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wr9 {
    public int a;
    public long b;
    public Object c;
    public int d;

    public static /* synthetic */ String a(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }
}
