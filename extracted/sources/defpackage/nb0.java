package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ir.mservices.market.views.BindAutoCompleteView;

/* JADX INFO: loaded from: classes3.dex */
public final class nb0 extends ArrayAdapter {
    public final /* synthetic */ BindAutoCompleteView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(BindAutoCompleteView bindAutoCompleteView, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.a = bindAutoCompleteView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        ((TextView) dropDownView.findViewById(R.id.text1)).setTextColor(sj8.b().m);
        return dropDownView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        ((TextView) view2.findViewById(R.id.text1)).setTextColor(sj8.b().m);
        return view2;
    }
}
