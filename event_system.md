# Event System을 어떻게 비동기 방식으로 구현할 것인지 고민해보자.

# Event System, Manager, Object #
다음을 고민해보자.
- Event System : 어떻게 전송하고, 어떻게 처리할 것인가?
- Event Manager : 이 기종, 타 모듈, Target 검색, Broadcast 등등을 고민
- Event Object : 누구에게 무엇을 전달할 것인가?
- Event 사용자 : 송수신자.

# Details #
### Event System ###
  1. 송신하려는 Event Object는 언제 처리할 것인가?
  1. 송신하려는 Event Object는 어떻게 처리할 것인가?
  1. 수신한 Event Object는 언제 처리할 것인가?
  1. 수신한 Event Object는 어떻게 처리할 것인가?
  1. Event Manager를 어떻게 관리할 것인가?

### Event Manager ###
  1. 이 기종간의 Event Manager 인식은 어떻게 할 것인가? (구현한 Event System을 사용할 경우)
  1. 모듈 간의 Event 송수신은?
  1. Event를 송수신 할 Target 검색 방법은?
  1. Broadcast 및 Multicast는? (모듈간, 전체 Event Manager간의 Event 전송이 포함될 것이다.)
  1. 어떻게 Event System에 등록, 삭제 할 것인가?

### Event Object ###
  1. Event Object는 무엇을 담고 있어야 하는가? (Event System, Manager가 어떻게 인식하도록 해야 하는지?)
  1. Target 및 Module, Manager, System을 구별하기 위해 무엇을 가지고 있어야 하는가?