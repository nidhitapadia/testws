# testws
Simple implementation of WS using RPC and DOCUMENT style. Just for learning purpose.

Two modules have been made one (jax-rs) containing the WS implementation and other (rpc-client) to comsume the WS

# Steps to run the application
1. Run HelloWorldPublisher.java (this will start the WS)
    Following WS endpoints will be published
    1. http://localhost:7779/ws/hellorpc - RPC implementation of WS
    2. http://localhost:7779/ws/hellodocument - Document implementation of WS
2. Run HelloWorldClient.java This will connect to WS on both the endpoints and provides output accordingly.
