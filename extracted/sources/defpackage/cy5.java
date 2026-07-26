package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cy5 implements View.OnLongClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ cy5(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                hh2.H(new hh2(view.getContext(), view.getResources().getString(rs6.like)));
                break;
            case 1:
                hh2.H(new hh2(view.getContext(), view.getResources().getString(rs6.dislike)));
                break;
            case 2:
                hh2.H(new hh2(view.getContext(), view.getResources().getString(rs6.like)));
                break;
            case 3:
                hh2.H(new hh2(view.getContext(), view.getResources().getString(rs6.dislike)));
                break;
            case 4:
                hh2.H(new hh2(view.getContext(), view.getResources().getString(rs6.like)));
                break;
            case 5:
                hh2.H(new hh2(view.getContext(), view.getResources().getString(rs6.dislike)));
                break;
            case 6:
                hh2.H(new hh2(view.getContext(), view.getResources().getString(rs6.like)));
                break;
            default:
                hh2.H(new hh2(view.getContext(), view.getResources().getString(rs6.dislike)));
                break;
        }
        return false;
    }
}
