package ir.mservices.market.social.users.common.data;

import defpackage.bf5;
import defpackage.f88;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class UsersDto implements Serializable, bf5 {

    @vo7("accounts")
    private final List<UserDto> accounts;

    @vo7("displayMode")
    private final String displayMode;

    @vo7("eol")
    private final boolean eol;

    @vo7("id")
    private final String id;

    @vo7("isLocked")
    private final boolean isLocked;

    @vo7("showMynetHint")
    private final boolean showMynetHint;

    @vo7("suggestionList")
    private final UsersDto suggestionList;

    @vo7("title")
    private final String title;

    public UsersDto(String str, String str2, String str3, boolean z, UsersDto usersDto, boolean z2, boolean z3, List<UserDto> list) {
        js3.p(str, "id");
        js3.p(str3, "title");
        this.id = str;
        this.displayMode = str2;
        this.title = str3;
        this.eol = z;
        this.suggestionList = usersDto;
        this.isLocked = z2;
        this.showMynetHint = z3;
        this.accounts = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsersDto copy$default(UsersDto usersDto, String str, String str2, String str3, boolean z, UsersDto usersDto2, boolean z2, boolean z3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = usersDto.id;
        }
        if ((i & 2) != 0) {
            str2 = usersDto.displayMode;
        }
        if ((i & 4) != 0) {
            str3 = usersDto.title;
        }
        if ((i & 8) != 0) {
            z = usersDto.eol;
        }
        if ((i & 16) != 0) {
            usersDto2 = usersDto.suggestionList;
        }
        if ((i & 32) != 0) {
            z2 = usersDto.isLocked;
        }
        if ((i & 64) != 0) {
            z3 = usersDto.showMynetHint;
        }
        if ((i & 128) != 0) {
            list = usersDto.accounts;
        }
        boolean z4 = z3;
        List list2 = list;
        UsersDto usersDto3 = usersDto2;
        boolean z5 = z2;
        return usersDto.copy(str, str2, str3, z, usersDto3, z5, z4, list2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.displayMode;
    }

    public final String component3() {
        return this.title;
    }

    public final boolean component4() {
        return this.eol;
    }

    public final UsersDto component5() {
        return this.suggestionList;
    }

    public final boolean component6() {
        return this.isLocked;
    }

    public final boolean component7() {
        return this.showMynetHint;
    }

    public final List<UserDto> component8() {
        return this.accounts;
    }

    public final UsersDto copy(String str, String str2, String str3, boolean z, UsersDto usersDto, boolean z2, boolean z3, List<UserDto> list) {
        js3.p(str, "id");
        js3.p(str3, "title");
        return new UsersDto(str, str2, str3, z, usersDto, z2, z3, list);
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersDto)) {
            return false;
        }
        UsersDto usersDto = (UsersDto) obj;
        return js3.i(this.id, usersDto.id) && js3.i(this.displayMode, usersDto.displayMode) && js3.i(this.title, usersDto.title) && this.eol == usersDto.eol && js3.i(this.suggestionList, usersDto.suggestionList) && this.isLocked == usersDto.isLocked && this.showMynetHint == usersDto.showMynetHint && js3.i(this.accounts, usersDto.accounts);
    }

    public final List<UserDto> getAccounts() {
        return this.accounts;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public int getHorizontalType() {
        String str;
        String mode = getMode();
        int iHashCode = mode.hashCode();
        if (iHashCode != -1919497322) {
            switch (iHashCode) {
                case 1734713453:
                    str = "Horizontal1";
                    break;
                case 1734713454:
                    return !mode.equals("Horizontal2") ? 1 : 2;
                case 1734713455:
                    return !mode.equals("Horizontal3") ? 1 : 3;
                default:
                    return 1;
            }
        } else {
            str = "Vertical";
        }
        mode.equals(str);
        return 1;
    }

    public final String getId() {
        return this.id;
    }

    public String getMode() {
        String str = this.displayMode;
        if (str == null) {
            return "Vertical";
        }
        if (f88.n0(str)) {
            str = null;
        }
        return str == null ? "Vertical" : str;
    }

    public final boolean getShowMynetHint() {
        return this.showMynetHint;
    }

    public final UsersDto getSuggestionList() {
        return this.suggestionList;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.displayMode;
        int iK = (rm7.k(this.title, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31) + (this.eol ? 1231 : 1237)) * 31;
        UsersDto usersDto = this.suggestionList;
        int iHashCode2 = (((((iK + (usersDto == null ? 0 : usersDto.hashCode())) * 31) + (this.isLocked ? 1231 : 1237)) * 31) + (this.showMynetHint ? 1231 : 1237)) * 31;
        List<UserDto> list = this.accounts;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean isMulti() {
        String mode = getMode();
        switch (mode.hashCode()) {
            case 1734713453:
                return mode.equals("Horizontal1");
            case 1734713454:
                return mode.equals("Horizontal2");
            case 1734713455:
                return mode.equals("Horizontal3");
            default:
                return false;
        }
    }

    public String toString() {
        String str = this.id;
        String str2 = this.displayMode;
        String str3 = this.title;
        boolean z = this.eol;
        UsersDto usersDto = this.suggestionList;
        boolean z2 = this.isLocked;
        boolean z3 = this.showMynetHint;
        List<UserDto> list = this.accounts;
        StringBuilder sbT = rm7.t("UsersDto(id=", str, ", displayMode=", str2, ", title=");
        sbT.append(str3);
        sbT.append(", eol=");
        sbT.append(z);
        sbT.append(", suggestionList=");
        sbT.append(usersDto);
        sbT.append(", isLocked=");
        sbT.append(z2);
        sbT.append(", showMynetHint=");
        sbT.append(z3);
        sbT.append(", accounts=");
        sbT.append(list);
        sbT.append(")");
        return sbT.toString();
    }
}
