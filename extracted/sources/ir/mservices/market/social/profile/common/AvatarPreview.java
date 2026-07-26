package ir.mservices.market.social.profile.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.f88;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.o13;
import defpackage.pq6;
import ir.mservices.market.views.AvatarImageView;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class AvatarPreview extends ConstraintLayout {
    public final o13 q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarPreview(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public static void t(String str, AvatarImageView avatarImageView) {
        avatarImageView.setVisibility((str == null || f88.n0(str)) ? 8 : 0);
        avatarImageView.setSize(avatarImageView.getResources().getDimensionPixelSize(pq6.default_icon_size));
        AvatarImageView.setImage$default(avatarImageView, str, null, null, null, 14, null);
    }

    public final void setData(List<String> list) {
        if (list != null) {
            String str = (String) a.q0(0, list);
            o13 o13Var = this.q;
            AvatarImageView avatarImageView = o13Var.v;
            js3.o(avatarImageView, "firstAvatar");
            t(str, avatarImageView);
            String str2 = (String) a.q0(1, list);
            AvatarImageView avatarImageView2 = o13Var.w;
            js3.o(avatarImageView2, "secondAvatar");
            t(str2, avatarImageView2);
            String str3 = (String) a.q0(2, list);
            AvatarImageView avatarImageView3 = o13Var.x;
            js3.o(avatarImageView3, "thirdAvatar");
            t(str3, avatarImageView3);
        }
        setVisibility((list == null || list.isEmpty()) ? 8 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = o13.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        o13 o13Var = (o13) a79.f0(layoutInflaterFrom, js6.holder_avatar_preview, this, true, null);
        js3.o(o13Var, "inflate(...)");
        this.q = o13Var;
    }

    public /* synthetic */ AvatarPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
