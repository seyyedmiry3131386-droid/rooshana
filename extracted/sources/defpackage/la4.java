package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.o;
import ir.mservices.market.version2.ui.recycler.holder.MultiSelectViewHolder$ViewHolderType;

/* JADX INFO: loaded from: classes3.dex */
public final class la4 extends o {
    public final i06 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public la4(MultiSelectViewHolder$ViewHolderType multiSelectViewHolder$ViewHolderType, ViewGroup viewGroup) {
        js3.p(multiSelectViewHolder$ViewHolderType, "type");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(js6.paging_footer_row_horizontal, viewGroup, false);
        super(viewInflate);
        int i = i06.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        this.u = (i06) fa1.a.b(js6.paging_footer_row_horizontal, viewInflate);
    }
}
