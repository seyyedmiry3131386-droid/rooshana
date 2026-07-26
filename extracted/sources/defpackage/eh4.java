package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class eh4 implements Map.Entry, dx3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ eh4(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && js3.i(entry.getKey(), this.b) && js3.i(entry.getValue(), getValue());
            case 1:
                Map.Entry entry2 = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry2 != null && js3.i(entry2.getKey(), this.b) && js3.i(entry2.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            case 1:
                Object obj2 = this.b;
                int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                Object value2 = getValue();
                return (value2 != null ? value2.hashCode() : 0) ^ iHashCode2;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.b);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
