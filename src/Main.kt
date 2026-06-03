fun checkNode(nodeId: Int, nodeName: String, isOnline: Boolean): String {
    return if (isOnline) {
        "Node $nodeId - $nodeName is online."
    } else {
        "Node $nodeId - $nodeName is offline"
    }
}

fun processCheck(nodeName: String, processId: Int, processRunning: Boolean): String {
    var processAttempts = 0

    while (processAttempts < 3) {
        println("Attempting process check $processAttempts for $nodeName")
        processAttempts += 1
    }
    println("Process checks are finished.")
    return "Checks are Finished"
}

fun main() {
    for (nodeId in 1..5) {
        println(checkNode(nodeId, "FederatedNode", true))
    }

    val node1 = processCheck("Shizuku", 1, true)
    val node2 = processCheck("Dhizuku", 3, true)
    val node3 = processCheck("Shizuku", 7, true)

    for (nodeId in 1..5 step 3) {
        if (isOnline) {
            if ()
        }
    }
}