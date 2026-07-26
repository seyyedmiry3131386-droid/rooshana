package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.movie.ui.detail.review.MovieUserSubmitReviewData;
import ir.mservices.market.social.list.common.ProfileSearchView;

/* JADX INFO: loaded from: classes3.dex */
public final class g85 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g85(int i, View view, Object obj) {
        this.a = i;
        this.b = view;
        this.c = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws InterruptedException {
        switch (this.a) {
            case 0:
                this.b.setEnabled(true ^ (editable == null || editable.length() == 0));
                ((MovieUserSubmitReviewData) this.c).h = String.valueOf(editable);
                break;
            default:
                ImageView imageView = ((ProfileSearchView) this.b).s.w;
                js3.o(imageView, "clear");
                imageView.setVisibility((editable == null || f88.n0(editable)) ? 8 : 0);
                ((n) this.c).invoke(editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
