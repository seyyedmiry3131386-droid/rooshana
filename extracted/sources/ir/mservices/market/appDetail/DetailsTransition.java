package ir.mservices.market.appDetail;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.ChangeClipBounds;
import android.transition.ChangeTransform;
import android.transition.TransitionSet;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes3.dex */
public class DetailsTransition extends TransitionSet {
    public DetailsTransition() {
        a();
    }

    public final void a() {
        setOrdering(0);
        addTransition(new ChangeBounds()).addTransition(new ChangeTransform()).addTransition(new ChangeClipBounds()).setDuration(400L);
    }

    public DetailsTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
