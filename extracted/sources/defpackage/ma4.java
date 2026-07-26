package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.o;
import com.google.android.material.loadingindicator.LoadingIndicator;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ma4 extends o {
    public final boolean u;
    public final ij2 v;
    public final LoadingIndicator w;
    public final MyketTextView x;
    public final SmallFillOvalButton y;

    /* JADX WARN: Illegal instructions before constructor call */
    public ma4(ViewGroup viewGroup, bp2 bp2Var, int i, int i2, boolean z) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(js6.footer_row_vertical, viewGroup, false);
        super(viewInflate);
        this.u = z;
        int i3 = ij2.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ij2 ij2Var = (ij2) fa1.a.b(js6.footer_row_vertical, viewInflate);
        this.v = ij2Var;
        LoadingIndicator loadingIndicator = ij2Var.w;
        js3.m(loadingIndicator);
        loadingIndicator.setVisibility(8);
        loadingIndicator.setIndicatorSize(loadingIndicator.getContext().getResources().getDimensionPixelSize(pq6.loading_fill_indicator_size));
        loadingIndicator.setIndicatorColor(i);
        this.w = loadingIndicator;
        MyketTextView myketTextView = ij2Var.v;
        js3.o(myketTextView, "errorMessage");
        this.x = myketTextView;
        SmallFillOvalButton smallFillOvalButton = ij2Var.x;
        smallFillOvalButton.setBgColor(i);
        smallFillOvalButton.setButtonTextColor(i2);
        smallFillOvalButton.setOnClickListener(new sm1(2, bp2Var));
        this.y = smallFillOvalButton;
    }
}
