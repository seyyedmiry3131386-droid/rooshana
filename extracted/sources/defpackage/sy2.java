package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sy2 {
    public static final sy2 b = new sy2();
    public final boolean a = true;

    public sy2() {
        if (s7.b("")) {
            return;
        }
        s7.b("");
    }

    public final void a(StringBuilder sb, String str) {
        o40.I(str, "prefix = \"", "", "\",", sb);
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
