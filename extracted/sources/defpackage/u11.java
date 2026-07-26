package defpackage;

import android.database.SQLException;
import androidx.room.coroutines.a;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u11 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u11(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        ub5 ub5VarI;
        switch (this.a) {
            case 0:
                a aVar = (a) this.c;
                String str = this.b ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                aVar.b.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                aVar.a.d(sb);
                try {
                    ln2.i(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i = aVar.g;
                    if (i == 1) {
                        throw e;
                    }
                    if (i == 2) {
                        e.printStackTrace();
                    }
                    return tx8.a;
                }
            case 1:
                bp2 bp2Var = (bp2) this.c;
                if (this.b) {
                    bp2Var.invoke();
                }
                return tx8.a;
            default:
                androidx.compose.foundation.text.input.internal.a aVar2 = (androidx.compose.foundation.text.input.internal.a) this.c;
                boolean z = this.b;
                tx8 tx8Var = tx8.a;
                if (z && (ub5VarI = aVar2.i()) != null) {
                    ((i) ub5VarI).e(tx8Var);
                }
                return tx8Var;
        }
    }

    public /* synthetic */ u11(a aVar, boolean z) {
        this.a = 0;
        this.c = aVar;
        this.b = z;
    }
}
