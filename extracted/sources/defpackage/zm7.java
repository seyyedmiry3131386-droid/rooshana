package defpackage;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;

/* JADX INFO: loaded from: classes.dex */
public final class zm7 {
    public final Handle a;
    public final long b;
    public final SelectionHandleAnchor c;
    public final boolean d;

    public zm7(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.a = handle;
        this.b = j;
        this.c = selectionHandleAnchor;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm7)) {
            return false;
        }
        zm7 zm7Var = (zm7) obj;
        return this.a == zm7Var.a && nr5.c(this.b, zm7Var.b) && this.c == zm7Var.c && this.d == zm7Var.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + ((nr5.e(this.b) + (this.a.hashCode() * 31)) * 31)) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) nr5.i(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return bl4.A(sb, this.d, ')');
    }
}
