package ir.mservices.market.common.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.app.home.data.AddaxBoxDto;

/* JADX INFO: loaded from: classes3.dex */
public final class AddaxBoxData implements MyketRecyclerData, g32, wo2 {
    public static final int c = js6.addax_box_one;
    public static final int d = js6.addax_box_two;
    public static final int e = js6.addax_box_three;
    public final AddaxBoxDto a;
    public final boolean b;

    public AddaxBoxData(AddaxBoxDto addaxBoxDto) {
        this.a = addaxBoxDto;
        this.b = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        String displayMode = this.a.getDisplayMode();
        int i = c;
        if (displayMode != null) {
            switch (displayMode.hashCode()) {
                case 3707:
                    displayMode.equals("v1");
                    break;
                case 3708:
                    if (displayMode.equals("v2")) {
                        return d;
                    }
                    break;
                case 3709:
                    if (displayMode.equals("v3")) {
                        return e;
                    }
                    break;
            }
        }
        return i;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddaxBoxData)) {
            return false;
        }
        AddaxBoxDto addaxBoxDto = this.a;
        String id = addaxBoxDto.getId();
        AddaxBoxDto addaxBoxDto2 = ((AddaxBoxData) obj).a;
        return js3.i(id, addaxBoxDto2.getId()) && js3.i(addaxBoxDto.getMessage(), addaxBoxDto2.getMessage()) && js3.i(addaxBoxDto.getIconUrl(), addaxBoxDto2.getIconUrl()) && js3.i(addaxBoxDto.getActionText(), addaxBoxDto2.getActionText());
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getId();
    }

    public final int hashCode() {
        AddaxBoxDto addaxBoxDto = this.a;
        int iHashCode = addaxBoxDto.getId().hashCode() * 31;
        String message = addaxBoxDto.getMessage();
        int iHashCode2 = (iHashCode + (message != null ? message.hashCode() : 0)) * 31;
        String iconUrl = addaxBoxDto.getIconUrl();
        int iHashCode3 = (iHashCode2 + (iconUrl != null ? iconUrl.hashCode() : 0)) * 31;
        String actionText = addaxBoxDto.getActionText();
        return iHashCode3 + (actionText != null ? actionText.hashCode() : 0);
    }

    public AddaxBoxData(AddaxBoxDto addaxBoxDto, boolean z) {
        this.a = addaxBoxDto;
        this.b = z;
    }
}
