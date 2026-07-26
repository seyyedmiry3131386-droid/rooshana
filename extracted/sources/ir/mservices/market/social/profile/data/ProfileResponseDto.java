package ir.mservices.market.social.profile.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileResponseDto implements Serializable {

    @vo7("account")
    private final AccountDto account;

    @vo7("forceUpdate")
    private final ForceUpdateDto forceUpdate;

    @vo7("isNewUser")
    private final Boolean isNewUser;

    @vo7("menus")
    private final List<MenuDto> menus;

    @vo7("messaging")
    private final ProfileMessagingDto messaging;

    @vo7("request")
    private final ProfileRequestDto profileRequest;

    @vo7("relations")
    private final RelationsDto relations;

    @vo7("tip")
    private final MessageBoxDto tip;

    public ProfileResponseDto(AccountDto accountDto, ForceUpdateDto forceUpdateDto, ProfileMessagingDto profileMessagingDto, RelationsDto relationsDto, ProfileRequestDto profileRequestDto, MessageBoxDto messageBoxDto, List<MenuDto> list, Boolean bool) {
        js3.p(accountDto, "account");
        js3.p(profileMessagingDto, "messaging");
        js3.p(relationsDto, "relations");
        this.account = accountDto;
        this.forceUpdate = forceUpdateDto;
        this.messaging = profileMessagingDto;
        this.relations = relationsDto;
        this.profileRequest = profileRequestDto;
        this.tip = messageBoxDto;
        this.menus = list;
        this.isNewUser = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileResponseDto copy$default(ProfileResponseDto profileResponseDto, AccountDto accountDto, ForceUpdateDto forceUpdateDto, ProfileMessagingDto profileMessagingDto, RelationsDto relationsDto, ProfileRequestDto profileRequestDto, MessageBoxDto messageBoxDto, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            accountDto = profileResponseDto.account;
        }
        if ((i & 2) != 0) {
            forceUpdateDto = profileResponseDto.forceUpdate;
        }
        if ((i & 4) != 0) {
            profileMessagingDto = profileResponseDto.messaging;
        }
        if ((i & 8) != 0) {
            relationsDto = profileResponseDto.relations;
        }
        if ((i & 16) != 0) {
            profileRequestDto = profileResponseDto.profileRequest;
        }
        if ((i & 32) != 0) {
            messageBoxDto = profileResponseDto.tip;
        }
        if ((i & 64) != 0) {
            list = profileResponseDto.menus;
        }
        if ((i & 128) != 0) {
            bool = profileResponseDto.isNewUser;
        }
        List list2 = list;
        Boolean bool2 = bool;
        ProfileRequestDto profileRequestDto2 = profileRequestDto;
        MessageBoxDto messageBoxDto2 = messageBoxDto;
        return profileResponseDto.copy(accountDto, forceUpdateDto, profileMessagingDto, relationsDto, profileRequestDto2, messageBoxDto2, list2, bool2);
    }

    public final AccountDto component1() {
        return this.account;
    }

    public final ForceUpdateDto component2() {
        return this.forceUpdate;
    }

    public final ProfileMessagingDto component3() {
        return this.messaging;
    }

    public final RelationsDto component4() {
        return this.relations;
    }

    public final ProfileRequestDto component5() {
        return this.profileRequest;
    }

    public final MessageBoxDto component6() {
        return this.tip;
    }

    public final List<MenuDto> component7() {
        return this.menus;
    }

    public final Boolean component8() {
        return this.isNewUser;
    }

    public final ProfileResponseDto copy(AccountDto accountDto, ForceUpdateDto forceUpdateDto, ProfileMessagingDto profileMessagingDto, RelationsDto relationsDto, ProfileRequestDto profileRequestDto, MessageBoxDto messageBoxDto, List<MenuDto> list, Boolean bool) {
        js3.p(accountDto, "account");
        js3.p(profileMessagingDto, "messaging");
        js3.p(relationsDto, "relations");
        return new ProfileResponseDto(accountDto, forceUpdateDto, profileMessagingDto, relationsDto, profileRequestDto, messageBoxDto, list, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileResponseDto)) {
            return false;
        }
        ProfileResponseDto profileResponseDto = (ProfileResponseDto) obj;
        return js3.i(this.account, profileResponseDto.account) && js3.i(this.forceUpdate, profileResponseDto.forceUpdate) && js3.i(this.messaging, profileResponseDto.messaging) && js3.i(this.relations, profileResponseDto.relations) && js3.i(this.profileRequest, profileResponseDto.profileRequest) && js3.i(this.tip, profileResponseDto.tip) && js3.i(this.menus, profileResponseDto.menus) && js3.i(this.isNewUser, profileResponseDto.isNewUser);
    }

    public final AccountDto getAccount() {
        return this.account;
    }

    public final ForceUpdateDto getForceUpdate() {
        return this.forceUpdate;
    }

    public final List<MenuDto> getMenus() {
        return this.menus;
    }

    public final ProfileMessagingDto getMessaging() {
        return this.messaging;
    }

    public final ProfileRequestDto getProfileRequest() {
        return this.profileRequest;
    }

    public final RelationsDto getRelations() {
        return this.relations;
    }

    public final MessageBoxDto getTip() {
        return this.tip;
    }

    public int hashCode() {
        int iHashCode = this.account.hashCode() * 31;
        ForceUpdateDto forceUpdateDto = this.forceUpdate;
        int iHashCode2 = (this.relations.hashCode() + ((this.messaging.hashCode() + ((iHashCode + (forceUpdateDto == null ? 0 : forceUpdateDto.hashCode())) * 31)) * 31)) * 31;
        ProfileRequestDto profileRequestDto = this.profileRequest;
        int iHashCode3 = (iHashCode2 + (profileRequestDto == null ? 0 : profileRequestDto.hashCode())) * 31;
        MessageBoxDto messageBoxDto = this.tip;
        int iHashCode4 = (iHashCode3 + (messageBoxDto == null ? 0 : messageBoxDto.hashCode())) * 31;
        List<MenuDto> list = this.menus;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isNewUser;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isNewUser() {
        return this.isNewUser;
    }

    public String toString() {
        return "ProfileResponseDto(account=" + this.account + ", forceUpdate=" + this.forceUpdate + ", messaging=" + this.messaging + ", relations=" + this.relations + ", profileRequest=" + this.profileRequest + ", tip=" + this.tip + ", menus=" + this.menus + ", isNewUser=" + this.isNewUser + ")";
    }
}
