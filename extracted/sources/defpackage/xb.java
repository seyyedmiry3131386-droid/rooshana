package defpackage;

import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;

/* JADX INFO: loaded from: classes.dex */
public final class xb {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof xb)) {
                return false;
            }
            xb xbVar = (xb) obj;
            int i = this.a;
            if (i != xbVar.a) {
                return false;
            }
            if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != xbVar.b || this.b != xbVar.d) {
                if (this.d != xbVar.d || this.b != xbVar.b) {
                    return false;
                }
                Object obj2 = this.c;
                if (obj2 != null) {
                    if (!obj2.equals(xbVar.c)) {
                        return false;
                    }
                } else if (xbVar.c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : AppStatusDto.Type.ADD);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
