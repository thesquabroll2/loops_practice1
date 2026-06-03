fun checkNode(nodeId: Int, nodeName: String, isOnline: Boolean): String {
    return if (isOnline) {
        "Node $nodeId - $nodeName is online."
    } else {
        "Node $nodeId - $nodeName is offline"
    }
}

fun processCheck(packageName: String, processId: Int, processRunning: Boolean, nodeName: String): String {
    var processAttempts = 0

    // While loop - demonstrates counting attempts
    while (processAttempts < 3) {
        println("Attempting process check $processAttempts for $packageName")
        processAttempts += 1
    }
    println("Process checks are finished.")

    // FIX: Now checks ONLY the specific processId passed in, not a hardcoded range
    if (processRunning) {
        if (packageName == "Shizuku") {
            println("$packageName is running successfully for process $processId ON $nodeName")
        } else {
            println("$packageName is not running on $nodeName")
        }
    } else {
        println("Process $processId on $nodeName is not running.")
    }

    return "Checks Complete for $packageName on $nodeName"
}

fun main() {
    // Demonstrates range 1..5
    println("=== CHECKING NODES ===")
    for (nodeId in 1..5) {
        println(checkNode(nodeId, "FederatedNode", true))
    }

    println("\n=== CHECKING PROCESSES ===")

    // Demonstrates calling the same function with different parameters
    val node1 = processCheck("Shizuku", 1, true, "8gb pi server")
    val node2 = processCheck("Dhizuku", 3, false, "4gb pi server")
    val node3 = processCheck("Shizuku", 7, true, "Akamai Ubuntu server")

    println("\n=== RESULTS ===")
    println(node1)
    println(node2)
    println(node3)

    // EXTRA: Demonstrates range with step
    println("\n=== PROCESS ID RANGE DEMO ===")
    for (processId in 1..5 step 2) {
        println("Would check process ID: $processId")
    }
}
