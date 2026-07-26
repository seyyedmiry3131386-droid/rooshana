package ir.mservices.market.social.mynet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cv;
import defpackage.js3;
import defpackage.pq6;
import defpackage.uf2;
import defpackage.w0;
import defpackage.yq6;
import ir.mservices.market.myAccount.dialog.Gender;
import ir.mservices.market.social.profile.data.TagItem;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInfoTagsView extends Hilt_UserInfoTagsView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoTagsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode()) {
            a();
        }
        setLayoutDirection(3);
    }

    public static /* synthetic */ void setTags$default(UserInfoTagsView userInfoTagsView, TagItem tagItem, TagItem tagItem2, TagItem tagItem3, TagItem tagItem4, int i, Object obj) {
        if ((i & 1) != 0) {
            tagItem = null;
        }
        if ((i & 2) != 0) {
            tagItem2 = null;
        }
        if ((i & 4) != 0) {
            tagItem3 = null;
        }
        if ((i & 8) != 0) {
            tagItem4 = null;
        }
        userInfoTagsView.setTags(tagItem, tagItem2, tagItem3, tagItem4);
    }

    public final TagView c(TagItem tagItem, Integer num) {
        Context context = getContext();
        js3.o(context, "getContext(...)");
        TagView tagView = new TagView(context, null);
        tagView.setData(tagItem, num);
        return tagView;
    }

    public final void setMargin(int i) {
        w0 w0Var = new w0(8, this);
        while (w0Var.hasNext()) {
            View view = (View) w0Var.next();
            js3.n(view, "null cannot be cast to non-null type ir.mservices.market.social.mynet.view.TagView");
            ((TagView) view).setLayoutParams(new uf2(i, getResources().getDimensionPixelSize(pq6.space_4)));
        }
    }

    public final void setTagSize(float f) {
        w0 w0Var = new w0(8, this);
        while (w0Var.hasNext()) {
            View view = (View) w0Var.next();
            js3.n(view, "null cannot be cast to non-null type ir.mservices.market.social.mynet.view.TagView");
            ((TagView) view).setTagSize(f);
        }
    }

    public final void setTags(TagItem tagItem, TagItem tagItem2, TagItem tagItem3, TagItem tagItem4) {
        removeAllViews();
        uf2 uf2Var = new uf2(getResources().getDimensionPixelSize(pq6.space_12), getResources().getDimensionPixelSize(pq6.space_4));
        if (tagItem4 != null) {
            cv cvVar = Gender.d;
            String value = tagItem4.getValue();
            cvVar.getClass();
            Gender genderV = cv.v(value);
            addView(c(tagItem4, genderV != null ? Integer.valueOf(genderV.c) : null), uf2Var);
        }
        if (tagItem2 != null) {
            addView(c(tagItem2, Integer.valueOf(yq6.ic_location)), uf2Var);
        }
        if (tagItem != null) {
            addView(c(tagItem, Integer.valueOf(yq6.ic_birthdate)), uf2Var);
        }
        if (tagItem3 != null) {
            addView(c(tagItem3, Integer.valueOf(yq6.ic_myket)), uf2Var);
        }
    }
}
