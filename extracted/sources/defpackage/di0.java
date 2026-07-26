package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
public final class di0 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SnapshotStateList b;

    public /* synthetic */ di0(SnapshotStateList snapshotStateList, int i) {
        this.a = i;
        this.b = snapshotStateList;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                gr3 gr3Var = (gr3) obj;
                boolean z = gr3Var instanceof zc3;
                SnapshotStateList snapshotStateList = this.b;
                if (z) {
                    snapshotStateList.add(gr3Var);
                } else if (gr3Var instanceof ad3) {
                    snapshotStateList.remove(((ad3) gr3Var).a);
                } else if (gr3Var instanceof gg2) {
                    snapshotStateList.add(gr3Var);
                } else if (gr3Var instanceof hg2) {
                    snapshotStateList.remove(((hg2) gr3Var).a);
                } else if (gr3Var instanceof rj6) {
                    snapshotStateList.add(gr3Var);
                } else if (gr3Var instanceof sj6) {
                    snapshotStateList.remove(((sj6) gr3Var).a);
                } else if (gr3Var instanceof qj6) {
                    snapshotStateList.remove(((qj6) gr3Var).a);
                }
                break;
            default:
                gr3 gr3Var2 = (gr3) obj;
                boolean z2 = gr3Var2 instanceof zc3;
                SnapshotStateList snapshotStateList2 = this.b;
                if (z2) {
                    snapshotStateList2.add(gr3Var2);
                } else if (gr3Var2 instanceof ad3) {
                    snapshotStateList2.remove(((ad3) gr3Var2).a);
                } else if (gr3Var2 instanceof gg2) {
                    snapshotStateList2.add(gr3Var2);
                } else if (gr3Var2 instanceof hg2) {
                    snapshotStateList2.remove(((hg2) gr3Var2).a);
                } else if (gr3Var2 instanceof rj6) {
                    snapshotStateList2.add(gr3Var2);
                } else if (gr3Var2 instanceof sj6) {
                    snapshotStateList2.remove(((sj6) gr3Var2).a);
                } else if (gr3Var2 instanceof qj6) {
                    snapshotStateList2.remove(((qj6) gr3Var2).a);
                } else if (gr3Var2 instanceof wu1) {
                    snapshotStateList2.add(gr3Var2);
                } else if (gr3Var2 instanceof xu1) {
                    snapshotStateList2.remove(((xu1) gr3Var2).a);
                } else if (gr3Var2 instanceof vu1) {
                    snapshotStateList2.remove(((vu1) gr3Var2).a);
                }
                break;
        }
        return tx8.a;
    }
}
