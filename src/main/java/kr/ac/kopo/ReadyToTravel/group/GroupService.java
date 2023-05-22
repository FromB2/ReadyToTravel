package kr.ac.kopo.ReadyToTravel.group;

import kr.ac.kopo.ReadyToTravel.dto.GroupDTO;
import kr.ac.kopo.ReadyToTravel.dto.MemberDTO;

import java.util.List;

public interface GroupService {

    void createGroup(Long planNum, Long leaderNum, String planName);

    void groupAddMember(Long memberNum, String inviteURL);

    void removeMember(long memberNum);

    void updateGroup(GroupDTO group);

    GroupDTO item(long groupNum);

    List<MemberDTO> groupInMember(long groupNum);
}

