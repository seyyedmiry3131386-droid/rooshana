package ir.mservices.market.social.profile.own.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class OwnProfileTipData implements MyketRecyclerData, g32, wo2 {
    public static final int b = js6.holder_own_profile_tip;
    public final MessageBoxDto a;

    public OwnProfileTipData(MessageBoxDto messageBoxDto) {
        this.a = messageBoxDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (OwnProfileTipData.class.equals(obj != null ? obj.getClass() : null) && (obj instanceof OwnProfileTipData)) {
            return !js3.i(((OwnProfileTipData) obj).a.getText(), this.a.getText());
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        MessageBoxDto messageBoxDto = this.a;
        String iconUrl = messageBoxDto.getIconUrl();
        int iHashCode = (iconUrl != null ? iconUrl.hashCode() : 0) * 31;
        String actionText = messageBoxDto.getActionText();
        int iHashCode2 = (iHashCode + (actionText != null ? actionText.hashCode() : 0)) * 31;
        String text = messageBoxDto.getText();
        return iHashCode2 + (text != null ? text.hashCode() : 0);
    }
}
